using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;
using UnityEngine.EventSystems;

public class ClickPositionManager_Sprint02 : MonoBehaviour
{
    private int shape = 0;
    private GameObject primitive;
    private float red = .8f, green = .8f, blue = .8f, destroyTime = 3f, timeToDestroy = 3f;
    public Text mousePostition, blueAmount, redAmount, greenAmount, sizeAmount, timerAmount;

    [SerializeField]
    private float distance = 5f, distanceChange;

    private Vector3 clickPosition;
    private bool timedDestroyIsOn = true;
    private float size = 0.5f;

    private Vector3 lastClickPosition = Vector3.zero;
    public Text lifeTime;

    public GameObject paintedObject00, paintedObject01, paintedObject02, explosion;
    private Color paintedObjectColor, paintedObjectEmission;

    public Clock01 clock;

    [SerializeField]
    [Range(0.0f, 2f)]
    private float emissionStrength = 0.5f;

    private float opacityStrength = 0.5f;

    void Update()
    {
        if (Input.GetMouseButtonDown(0))//left click!!       or is this -->|| 
        {
            //checking for any colliders out in the virtual world that my mousePosition is over
            //when the user left clicks or holds 
            Ray ray = Camera.main.ScreenPointToRay(Input.mousePosition);
            RaycastHit hit; //don't have to assign this as the raycast will assign this procedurally

            if (Physics.Raycast(ray, out hit))//need to add max distance, and layerMask
            {
                if (hit.transform.gameObject.layer == 11)//Clockface
                {
                    hit.transform.parent.GetComponent<Clock01>().UpdateTime(hit.transform.localEulerAngles.y);
                    //Debug.Log(hit.transform.rotation.ToString());
                }
            }
        }

        //new
        Debug.Log((EventSystem.current.currentSelectedGameObject == null));

        //new if check
        if (Input.GetMouseButton(1) && (EventSystem.current.currentSelectedGameObject == null)) //left hold
        {
            //checking for any colliders out in the virtual world that my mousePosition is over
            Ray ray = Camera.main.ScreenPointToRay(Input.mousePosition);
            RaycastHit hit; //don't have to assign this as the raycast will assign this procedurally

            if (Physics.Raycast(ray, out hit))
            {
                if (hit.transform.gameObject.layer == 12)//paintedObject
                {
                    Destroy(hit.transform.gameObject);
                    primitive = Instantiate(explosion, hit.transform.position, Quaternion.identity);
                    Destroy(primitive, 1f);
                }
                //this destroys the paint object, but we can modify
            }
        }

        if (Input.GetMouseButtonUp(0)) //user released right mouse button 
        {
            lastClickPosition = Vector3.zero;
        }

        if (Input.GetMouseButton(0) && (EventSystem.current.currentSelectedGameObject == null) && Input.mousePosition.x > 250f) // left hold || Input.GetMouseButton(1)) //if right click or hold
        {
            clickPosition = Camera.main.ScreenToWorldPoint(Input.mousePosition + new Vector3(0f, 0f, distance));

            switch (shape)
            {
                case 0:
                    //primitive = GameObject.CreatePrimitive(PrimitiveType.Sphere);
                    primitive = Instantiate(paintedObject01, clickPosition, Quaternion.identity);
                    break;

                case 1:
                    //primitive = GameObject.CreatePrimitive(PrimitiveType.Cube);
                    primitive = Instantiate(paintedObject01, clickPosition, Quaternion.identity);
                    break;

                case 2:
                    //primitive = GameObject.CreatePrimitive(PrimitiveType.Cylinder);
                    primitive = Instantiate(paintedObject01, clickPosition, Quaternion.identity);
                    break;
                default://if no cases are true, do this by default
                    break;
            }

            if (lastClickPosition == Vector3.zero) primitive.transform.localScale = new Vector3(Random.Range(0.1f, 1f) * size, Random.Range(0.1f, 1f) * size, Random.Range(0.1f, 1f) * size);
            else
            {
                //new
                //float
                //float x = Mathf.Clamp(Random.Range(0.5f, 3f) * Mathf.Abs(lastClickPosition.x), - clickPosition.x),*.1f,*5f);
                float x = Mathf.Clamp(Random.Range(size, size * 6f) * Mathf.Abs(lastClickPosition.x - clickPosition.x), .1f, size * 10f);
                float y = Mathf.Clamp(Random.Range(size, size * 6f) * Mathf.Abs(lastClickPosition.y - clickPosition.y), .1f, size * 10f);
                float z = (x + y) / 2f;
                primitive.transform.localScale = new Vector3(x, y, z);
            }
            
            //randomizing color and scale
            //primitive.transform.position =clickPosition;

            paintedObjectColor = new Color(Random.Range(0.0f, red), Random.Range(0.0f, green), Random.Range(0.0f, blue), 0.5f);
            primitive.GetComponent<Renderer>().material.color = paintedObjectColor;
            paintedObjectEmission = new Color(paintedObjectColor.r * emissionStrength, paintedObjectColor.g * emissionStrength, paintedObjectColor.b * emissionStrength);
            primitive.GetComponent<Renderer>().material.SetColor("_EmissionColor", paintedObjectEmission);

            primitive.transform.parent = this.transform;
            if (timedDestroyIsOn)
            {
                Destroy(primitive, timeToDestroy);

            }
            lastClickPosition = clickPosition;
        }
        mousePostition.text = "Mouse Position x: " + Input.mousePosition.x.ToString("F0") + ", y: " + Input.mousePosition.y.ToString("F0");
    }

    public void changeShape(int tempShape)
    {
        shape = tempShape;
    }

    public void changeRed(float tempRed)
    {
        red = tempRed;
        redAmount.text = (red * 100f).ToString("F0");
    }
    public void changeGreen(float tempGreen)
    {
        green = tempGreen;
        greenAmount.text = (green * 100f).ToString("F0");
    }
    public void changeBlue(float tempBlue)
    {
        blue = tempBlue;
        blueAmount.text = (blue * 100f).ToString("F0");
    }
    public void destroyObjects()
    {
        foreach (Transform child in transform)
        {
            Destroy(child.gameObject);
            primitive = Instantiate(explosion, child.position, Quaternion.identity);
            Destroy(primitive, 1f);
        }
    }

    public void ToggleTimedDestroy(bool timer)
    {
        timedDestroyIsOn = timer;
    }

    //new
    public void ChangeSize(float temp)
    {
        
        foreach (Transform child in transform)
        {
            child.localScale = child.localScale * temp / size;

        }
        size = temp;
    }

    //new
    public void ChangeEmissionStrength(float temp)
    {
        foreach (Transform child in transform)
        {
            paintedObjectColor = child.GetComponent<Renderer>().material.GetColor("_Color");
            paintedObjectEmission = new Color(paintedObjectColor.r * temp, paintedObjectColor.g * temp, paintedObjectColor.b * temp);
            child.GetComponent<Renderer>().material.SetColor("_emissionColor", paintedObjectEmission);
        }
        emissionStrength = temp;
    }
    public void ChangeOpacityStrength(float temp)
    {
        foreach (Transform child in transform)
        {
            paintedObjectColor = child.GetComponent<Renderer>().material.GetColor("_Color");
            paintedObjectColor.a = temp;
            child.GetComponent<Renderer>().material.SetColor("_Color", paintedObjectColor);
        }
    }
        

    public void ChangeTimeToDestroy(float temp)
    {
        timeToDestroy = temp;
        timerAmount.text = timeToDestroy.ToString("F0") + "Sec";

            }
}


