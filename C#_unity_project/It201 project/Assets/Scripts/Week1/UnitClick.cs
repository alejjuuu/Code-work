using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class UnitClick : MonoBehaviour
{
    // Start is called before the first frame update
    /*
    void Start()
    {
        Debug.Log("This is the unity console");
    }

    // Update is called once per frame
    void Update()
    {
        Debug.Log("This is the unity console");
    }
    private void OnMouseDown()
    {
        Debug.Log(name + " Was clicked, only world postition returned is" + transform.position);
    */
    private void OnMouseDown()
    {
        Debug.Log(this.gameObject.name + " Was clicked, only world postition returned is" + this.gameObject.transform.position);

    }
}
