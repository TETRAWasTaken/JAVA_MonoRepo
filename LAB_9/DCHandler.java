package LAB_9;

public class DCHandler extends Thread {
    private DBConn dbconn;

    public DCHandler(DBConn dbConn) {
        this.dbconn = dbConn;
    }

    @Override
    public void run() {
        dbconn.connect();
    }

    
    
}
