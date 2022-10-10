import static org.junit.Assert.*;

import org.junit.Test;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RegistryTest {

    private Registry registry;

    @Before
    public void startTest(){
        registry = new Registry();
    }

    @Test
    public void registerResultValid(){

        Person person = new Person("Davor", 1010095834, 18, Gender.MALE, true);
        
        RegisterResult result = registry.registerVoter(person);
        
        Assert.assertEquals(RegisterResult.VALID, result);
    }

    @Test
    public void registerResultUnderage(){

        Person person = new Person("Davor", 1010095834, 16, Gender.MALE, true);
        
        RegisterResult result = registry.registerVoter(person);
        
        Assert.assertEquals(RegisterResult.UNDERAGE, result);

    }

    @Test
    public void registerResultInvalidAge(){

        Person person = new Person("Davor", 1010095834, -18, Gender.MALE, true);
        
        RegisterResult result = registry.registerVoter(person);
        
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }

    @Test
    public void registerResultDead(){
        Person person = new Person("Davor", 1010095834, 18, Gender.MALE, false);
        
        RegisterResult result = registry.registerVoter(person);
        
        Assert.assertEquals(RegisterResult.DEAD, result);

    }

    @Test
    public void registerResultDuplicated(){
        Person person = new Person("Davor", 1010095834, 18, Gender.MALE, true);

        registry.registerVoter(person);
        RegisterResult result = registry.registerVoter(person);
     
        Assert.assertEquals(RegisterResult.DUPLICATED, result);

    }



    @After
    public void endTest(){
        registry = null;
    }
}
