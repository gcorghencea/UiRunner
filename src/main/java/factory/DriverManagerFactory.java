package factory;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class DriverManagerFactory {

    public static DriverManager getManager(DriverType type){

        DriverManager driverManager;

        switch (type){
            case CHROME:
                driverManager = new ChromeDriverManager();
                break;
            case FIREFOX:
                throw new NotImplementedException();
//                driverManager = new FirefoxDriverManager();
//                break;
            case IE:
                throw new NotImplementedException();
//                driverManager = new InternetExplorerManager();
//                break;
            case SAFARI:
                throw new NotImplementedException();
//                driverManager = new SafariDriverManager();
//                break;
            default:
                throw new NotImplementedException();
//                driverManager = new EdgeDriverManager();
//                break;
        }
        return driverManager;
    }
}
