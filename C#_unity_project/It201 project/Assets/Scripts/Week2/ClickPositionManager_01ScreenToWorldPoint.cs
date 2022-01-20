using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class ClickPositionManager_01ScreenToWorldPoint: MonoBehaviour
{
    //[Range(1f,30f)]
    [SerializeField]
    private float distance = 3f;
    public GameObject fancy;
    //[Range(-3f, 3f)]
    [SerializeField]

    public float distanceChange = 1f;
    private void Update()
    {
        
        if (Input.GetMouseButtonDown(0) || Input.GetMouseButton(1))
        {
            distance += distanceChange;

            //Goal: log click position in world space to the console

            //create a vector to store the mouse position
            //Set it to a default value whose value will never be recorded from the mouse position
            //so when start clicking will get results of (-1,-1,-1) that we know if not real information

            /*float posX = -1f;
            float posY = -1f;
            float posZ = -1f;
            Vector3 clickPosition = new Vector3(posX, posY, posZ); //-Vector.one;*/
            //Same as above

            Vector3 clickPosition = -Vector3.one;


            //method1: ScreenToWorldPoint
            //going to use screenToworldPoint, a built in unity method that derives from cameras
            //vector to pass to method contains two main pieces of information
            //x, and y coordinates are the pixel locations on the screen where the mouse is
            //can get that from Input.mousePosition but z is zero from that
            //we need a z location of how far into the virtual world that we want to determine our click was at
            //for  now, we arbitrary pick z=5

            clickPosition = Camera.main.ScreenToWorldPoint(Input.mousePosition + new Vector3(0f,0f,distance));

            //print out the position an spawn a sphare
            Debug.Log(clickPosition);
            //GameObject sphere = GameObject.CreatePrimitive(PrimitiveType.Cylinder);
            //sphere.transform.position = clickPosition;

            GameObject tempGo = Instantiate(fancy, clickPosition, Quaternion.identity);
            //Instantiate(fancy, clickPosition, Quaternion.identity);
            //Instantiate(fancy);
            //fancy/tranform.postion = clickPostion'
            Destroy(tempGo, 3f);


        }
    }
    public void ChangeDistance(float change) {
        distance = change;
    }

    public void ChangeDistanceDetla(float change)
    {
        distanceChange = change;
    }
}


 