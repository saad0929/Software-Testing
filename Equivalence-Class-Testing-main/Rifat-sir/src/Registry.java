

import java.util.HashMap;

public class Registry {
    private HashMap<Integer, Person> registry;
    public Registry(){
        registry = new HashMap<Integer, Person>();
    }
    public boolean idDuplicated(Person p){
        return registry.containsKey(p.getId());
    }
    public RegisterResult registerVoter(Person p) {
        RegisterResult result = null;
        if (!idDuplicated(p) && p.getAge() >= 18 && p.isAlive()){
            registry.put(p.getId(), p);
            result = RegisterResult.VALID;
        }else{
            if(p.getAge() < 0)result = RegisterResult.INVALID_AGE;
            if(p.getAge() >= 0 && p.getAge() < 18)result = RegisterResult.UNDERAGE;
            if ( idDuplicated(p))result = RegisterResult.DUPLICATED;
            if (!p.isAlive())result = RegisterResult.DEAD;
        }
        return result;
    }
}