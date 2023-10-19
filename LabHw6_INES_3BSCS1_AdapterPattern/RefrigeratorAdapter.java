package LabHw6_INES_3BSCS1_AdapterPattern;

public class RefrigeratorAdapter implements PowerOutlet
{
    private Refrigerator refrigerator;
    public RefrigeratorAdapter(Refrigerator refrigerator)
    {
        this.refrigerator = refrigerator;
    }
    @Override
    public String plugIn()
    {
        return refrigerator.startCooling();
    }
}
