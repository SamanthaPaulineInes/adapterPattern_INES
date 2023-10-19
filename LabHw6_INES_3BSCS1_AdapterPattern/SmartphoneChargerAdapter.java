package LabHw6_INES_3BSCS1_AdapterPattern;
public class SmartphoneChargerAdapter implements PowerOutlet
{
    private SmartphoneCharger smartphoneCharger;
    public SmartphoneChargerAdapter(SmartphoneCharger smartphoneCharger)
    {
        this.smartphoneCharger = smartphoneCharger;
    }
    @Override
    public String plugIn()
    {
        return smartphoneCharger.chargePhone();
    }
}
