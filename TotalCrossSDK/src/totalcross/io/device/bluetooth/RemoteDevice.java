/*********************************************************************************
 *  TotalCross Software Development Kit                                          *
 *  Copyright (C) 2000-2012 SuperWaba Ltda.                                      *
 *  All Rights Reserved                                                          *
 *                                                                               *
 *  This library and virtual machine is distributed in the hope that it will     *
 *  be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of    *
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.                         *
 *                                                                               *
 *  This file is covered by the GNU LESSER GENERAL PUBLIC LICENSE VERSION 3.0    *
 *  A copy of this license is located in file license.txt at the root of this    *
 *  SDK or can be downloaded here:                                               *
 *  http://www.gnu.org/licenses/lgpl-3.0.txt                                     *
 *                                                                               *
 *********************************************************************************/

package totalcross.io.device.bluetooth;

import totalcross.io.*;

/**
 * The RemoteDevice class represents a remote Bluetooth device. It provides basic information about a remote device
 * including the device's Bluetooth address and its friendly name.
 * 
 * @since TotalCross 1.15
 */
public class RemoteDevice
{
   /** The Bluetooth specification calls this name the "Bluetooth device name" or the "user-friendly name". */
   String friendlyName;

   /** Bluetooth device address */
   String address;

   /**
    * Creates a Bluetooth device based upon its address. The Bluetooth address must be 12 hex characters long. Valid
    * characters are 0-9, a-f, and A-F. There is no preceding "0x" in the string. For example, valid Bluetooth addresses
    * include but are not limited to:<br>
    * 008037144297<br>
    * 00af8300cd0b<br>
    * 014bd91DA8FC
    * 
    * @param address
    *           the address of the Bluetooth device as a 12 character hex string
    * @since TotalCross 1.15
    */
   protected RemoteDevice(String address)
   {
      this.address = address;
   }

   /**
    * Returns the name of this device. The Bluetooth specification calls this name the "Bluetooth device name" or the
    * "user-friendly name".
    * 
    * @return the name of the device, or null if the Bluetooth system does not support this feature; if the local device
    *         is able to contact the remote device, the result will never be null; if the remote device does not have a
    *         name then an empty string will be returned
    * @since TotalCross 1.15
    */
   public String getFriendlyName() throws IOException
   {
      return friendlyName;
   }

   /**
    * Retrieves the Bluetooth address of this device. The Bluetooth address will be 12 characters long. Valid characters
    * are 0-9 and A-F. This method will never return null.
    * 
    * @return the Bluetooth address of the remote device
    * @since TotalCross 1.15
    */
   public String getBluetoothAddress()
   {
      return address;
   }

   /**
    * Returns a string representation of the object in the format "address - friendlyName".
    * 
    * @return a string representation of the object in the format "address - friendlyName"
    * @since TotalCross 1.30
    */
   public String toString()
   {
      return address + " - " + friendlyName;
   }
}
