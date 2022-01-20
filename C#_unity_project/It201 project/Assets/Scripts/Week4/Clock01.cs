using System;
using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

public class Clock01 : MonoBehaviour
{
    public Transform hoursTranform, minutesTransform, secondsTransform;
    const float degreesPerHour = 30f, degreesPerMinute = 6f, degreesPerSecond = 6f, degreesPerDayCycle = 15f;
    private DateTime timeDiscrete;
    private TimeSpan timeContinuous;
    public bool continuos = true;
    public Transform dayCycle;

    public Text textAMPM;
    private bool isAM;

    //[Range(0,23)]
    //public int hours;

    private float hours, minutes, hoursTemp;

    //use this for initialization
    private void Awake()
    {
        timeDiscrete = DateTime.Now;
        timeContinuous = DateTime.Now.TimeOfDay;
        hours = (float)timeContinuous.TotalHours;
        minutes = (float)timeContinuous.TotalMinutes;
        hoursTranform.localRotation = Quaternion.Euler(0f, hours * degreesPerHour, 0f);
        minutesTransform.localRotation = Quaternion.Euler(0f, minutes * degreesPerHour, 0f);
        secondsTransform.localRotation = Quaternion.Euler(0f, (float)timeContinuous.TotalSeconds * degreesPerHour, 0f);

        if (hours < 12)
        {
            isAM = true;
            textAMPM.text = "AM";

        }
        else
        {
            isAM = false;
            textAMPM.text = "PM";
        }
    }

    private void Update()
    {
        timeContinuous = DateTime.Now.TimeOfDay;
        //hours = (float)timeContinuous.TotalHours;
        minutes = (float)timeContinuous.TotalMinutes;

        minutesTransform.localRotation = Quaternion.Euler(0f, minutes * degreesPerHour, 0f);
        Debug.Log(hours);
        hoursTranform.localRotation = Quaternion.Euler(0f, hours * degreesPerHour, 0f);
        dayCycle.localRotation = Quaternion.Euler(hours * degreesPerDayCycle, 0f, 0f); //divide by two because

        if (continuos)
        {
            UpdateContinuous();

        }
        else
        {
            UpdateDiscrete();
        }

    }

    //Update is called once per frame
    void UpdateContinuous()
    {
       secondsTransform.localRotation = Quaternion.Euler(0f, (float)timeContinuous.TotalSeconds * degreesPerSecond,0f);
    }

    void UpdateDiscrete()
    {
        timeDiscrete = DateTime.Now;
        secondsTransform.localRotation = Quaternion.Euler(0f, timeDiscrete.Second * degreesPerSecond, 0f);
    }


    public void UpdateTime(float clickedHourRotation)
    {
        hoursTemp = ((float)timeContinuous.TotalHours - (int)timeContinuous.TotalHours) * (clickedHourRotation / degreesPerHour);
        if (!isAM) hoursTemp += 12f;
        if ((int)hoursTemp < (int)hours)
        {
            hours = hoursTemp;
            UpdateAMPM();

        }
        else hours = hoursTemp;
    }

    public void UpdateAMPM()
    {
        if (isAM)
        {
            isAM = false;
            textAMPM.text = "PM";
        }
        else
        {
            isAM = true;
            textAMPM.text = "AM";
            hours -= 12f;
        }
    }
    public float getHours()
    {
        return hours;

    }
}

