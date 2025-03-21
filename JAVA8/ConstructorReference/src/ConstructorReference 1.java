sor.OnReadingChanged(ICustomSensor sender, ICustomSensorReadingChangedEventArgs e)
2025.03.21 05:37:01.966 [8852] (00010) E FreefallCollec: Cannot retrieve System.UInt32 property "{c458f8a7-4Ae8-4777-9607-2e9bdd65110a} 163" (0xD0000225)
 *** GetProperty() in FreefallSensor.cs(323) 
2025.03.21 05:37:01.966 [8852] (00010) E FreefallCollec: Cannot create an FFS reading *** OnReadingChanged() in FreefallSensor.cs(193) 
2025.03.21 05:37:01.966 [8852] (00010) V FreefallCollec: [D] An exception was raised:
System.Runtime.InteropServices.COMException (0xD0000225): 0xD0000225
   at ABI.Windows.Foundation.Collections.IMapViewMethods`2.Lookup(IObjectReference obj, K key)
   at ABI.System.Collections.Generic.IReadOnlyDictionaryMethods`2.Lookup(IObjectReference obj, K key)
   at Dell.TechHub.Devices.FreefallSensor.GetProperty[T](IReadOnlyDictionary`2 properties, String prefix, PropertyKeySuffix suffix)
   at Dell.TechHub.Devices.FreefallSensor.CreateFreefallSensorReading(ICustomSensorReading csr)
   at Dell.TechHub.Devices.FreefallSensor.OnReadingChanged(ICustomSensor sender, ICustomSensorReadingChangedEventArgs e)
2025.03.21 05:37:01.976 [8852] (00010) E FreefallCollec: Cannot retrieve System.UInt32 property "{c458f8a7-4Ae8-4777-9607-2e9bdd65110a} 163" (0xD0000225)
 *** GetProperty() in FreefallSensor.cs(323) 
2025.03.21 05:37:01.976 [8852] (00010) E FreefallCollec: Cannot create 