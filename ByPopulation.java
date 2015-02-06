import java.util.Comparator;

public class ByPopulation implements Comparator<City> 
{
    
    @Override
    public int compare(City o1, City o2) 
    {
        if(o1.getPopulation() > o2.getPopulation())
            return -1;
        else
            if(o1.getPopulation() < o2.getPopulation())
                return 1;
        else
            if(o1.getPopulation() == o2.getPopulation())
            {
                if(o1.getName().equals(o2.getName()))
                    return o1.getState().compareTo(o2.getName());
                else
                    return o1.getPopulation();
            }
        
        return o2.getPopulation() - o1.getPopulation();
    }
    
}
