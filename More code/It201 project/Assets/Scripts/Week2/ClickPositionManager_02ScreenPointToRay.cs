using UnityEngine;

public class ClickPositionManager_02ScreenPointToRay : MonoBehaviour
{
    public LayerMask clickMask;

    //Update is called once per frame
    void Update() {
        if (Input.GetMouseButtonDown(0) || Input.GetMouseButton(1))
        {
           

            //Goal: log click position in world space to the console

            //create a vector to store the mouse position
            //Set it to a default value whose value will never be recorded from the mouse position
            //so when start clicking will get results of (-1,-1,-1) that we know if not real information           

            Vector3 clickPosition = -Vector3.one;

            //method2: Raycast using Colliders
            //Casts a ray from the position of the camera out through the mouse out to infinity
            Ray ray = Camera.main.ScreenPointToRay(Input.mousePosition); //dont need a z distance
            //create a raycashit but its automatically populated from where the ray will hit a collider
            RaycastHit hit; //dont have to assign this as the waycast will assign this procedurally 

            /*
            if (Physics.Raycast(ray, out hit)) //export out the information to hit
            {
                clickPosition = hit.point;
                GameObject primitive = GameObject.CreatePrimitive(PrimitiveType.Sphere);
                primitive.transform.position = clickPosition;
            }
            */

            
             if (Physics.Raycast(ray, out hit, 100f, clickMask)) //need to add max distance, and layerMask
             {
                //hit has alot of information about the raycast collision on both sides
                clickPosition = hit.point;
                GameObject primitive = GameObject.CreatePrimitive(PrimitiveType.Sphere);
                primitive.transform.position = clickPosition;

                //but it hits everything which is a problem as the spheres populate more
                //so add physics layers and update the Raycast method call
            }                                              
            

            //print out the position and spawn a sphere
            Debug.Log(clickPosition);
            //GameObject sphere = GameObject.CreatePrimitive(PrimitiveType.Cylinder);
            //primitive.transform.position = clickPosition;


        }
    }
}

