using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

public class ClickPositionManager_00randomScaleColor : MonoBehaviour{
    private GameObject primitive;
    //Update is called once per frame
    void Update()
    {
        if (Input.GetMouseButtonDown(0) || Input.GetMouseButton(1))
        {
            //Goal: log click position in world space to the console

            //create a vector to store the mouse position
            //set it to a default value whose value will never be recorded from the mouse position
            //so when start clicking will get results of (-1,-1,-1) that we know if not real information

            Vector3 clickPosition = -Vector3.one;


            //method 3: Raycast using Plane
            Plane plane = new Plane(Vector3.forward, 0f); //.up
                                                          //Plane plane = new Plane(Vector3.forward,0f);
            Ray ray = Camera.main.ScreenPointToRay(Input.mousePosition);
            float distanceToPlane;

            if (plane.Raycast(ray, out distanceToPlane))
            {
                clickPosition = ray.GetPoint(distanceToPlane);
            }
            //print out the position and spawn a sphere 

            Debug.Log(clickPosition);
            primitive = GameObject.CreatePrimitive(PrimitiveType.Sphere);
            //randomizing colors and scale
            primitive.transform.localScale = new Vector3(Random.Range(0.1f, 1f), Random.Range(0.1f, 1f), Random.Range(0.1f, 1f));
            primitive.transform.position = clickPosition;
            primitive.GetComponent<Renderer>().material.color = new Vector4(Random.Range(0f, 1f), Random.Range(0f, 1f), 1f);

            Destroy(primitive,3f);

        }
    }
}
