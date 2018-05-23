using System;
using System.Collections;
using System.IO.Ports;
using UnityEngine;

public class ComPort : MonoBehaviour
{
    private string COM;
    private string st="Chlen";
    private SerialPort serialPort;
    private bool serialOK = false;
    private int bufIndex = 0;
    int k = 0;

    private void OnGUI()
    {
        k = SerialPort.GetPortNames().Length;
        GUI.Label(new Rect(0, 0, 200, 200), ""+k);

    }

  /*
    void Update()
    {
        for (int i = 1; i < 16; i++)
        {
            COM = "COM"+i;
            Debug.Log(COM);
            serialPort = new SerialPort(COM, 9600, Parity.None, 8, StopBits.One);

            try
            {
                serialPort.RtsEnable = true;
                serialPort.Open();
                serialOK = true;
                st = COM;
                Debug.Log("Serial OK");

            }
            catch (Exception)
            {
                Debug.LogError("Failed to open serial port for accelero-sensor.");
            }
        }
    }
    */
  
    
}