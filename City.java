
public class City implements Comparable<City> 
{
    private String name;
    private String state;
    private int population;
    
    public City(String name, String state, int population)
    {
        this.name = name;
        this.state = state; 
        this.population = population; 
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getState()
    {
        return state;
    }
    
    public int getPopulation()
    {
        return population;
    }
    
    public void setName(String n)
    {
        name = n;
    }
    
    public void setState(String s)
    {
        state = s;
    }
    
    public void setPopulation(int p)
    {
        population = p;
    }

    @Override
    public int compareTo(City that) 
    {
        int temp = this.state.compareTo(that.state);
        
        if(temp!=0)
            return temp;
        else
            return this.name.compareTo(that.state);
    }
    
    public String toString()
    {
        return state + "," + name;
    }
}
