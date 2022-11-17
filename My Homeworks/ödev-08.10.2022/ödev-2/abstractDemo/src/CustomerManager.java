public class CustomerManager {

    BaseDatabaseManager databaseManager;

    public void getCustomers(){
//        OracleDatabaseManager oracleDatabaseManager=new OracleDatabaseManager();
//        oracleDatabaseManager.getData();
        databaseManager.getData();
    }
}
