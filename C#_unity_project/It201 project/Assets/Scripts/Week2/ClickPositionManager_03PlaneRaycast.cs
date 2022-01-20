using System.Collections;
using System.Collections.Generic;
using UnityEngine.UI;
using UnityEngine;


public class ClickPositionManager_03PlaneRaycast : MonoBehaviour {

    // dont need the layer mask and switched variable declaration to global
    private GameObject primitive;


    //update is called once per frame
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
            primitive.transform.position = clickPosition;

            //Destroy(primitive, 3f);
        }

    }

}