// try-with-resource 구문
//

public class Ex07 {
    public static void main(String[] args){
        try(CloseableResource cr = new CloseableResource()){
            cr.exceptionWork(false); //예외가 발생하지 않음
        }catch (WorkException e){
            e.printStackTrace();
        }catch (CloseException e){
            e.printStackTrace();
        }
        System.out.println();

        try(CloseableResource cr = new CloseableResource()){
            cr.exceptionWork(true); //예외가 발생함
        }catch (WorkException e){
            e.printStackTrace();
        }catch (CloseException e){
            e.printStackTrace();
        }
        System.out.println();
    }
}

class CloseableResource implements AutoCloseable{

    @Override
    public void close() throws CloseException{
        System.out.println("close() 호출됨");
        throw new CloseException("CloseException 발생 !");
    }
    public void exceptionWork(boolean exception) throws WorkException{
        System.out.println("exceptionWork(" + exception + ")가 호출됨");
        if(exception){
            throw new WorkException("WorkException 발생 !");
        }
    }
}

class CloseException extends Exception{
    public CloseException(String message){
        super(message);
    }
}

class WorkException extends Exception{
    public WorkException(String message){
        super(message);
    }
}