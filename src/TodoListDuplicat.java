public class TodoListDuplicat {

    public static String [] data = new String[10];

    public static void main(String[] args) {

    testdeleteTodoListduplicat();
    }
    public static void showTodoListduplicat (){

        for(var i=0; i< data.length;i++){
            //var nampil = data[i];

            if(data[i]!=null){
                System.out.println((i+1) +". " + data[i]);
            }
        }

    }

    public static void testshowTodoListduplicat (){
        showTodoListduplicat();
    }

    public static void addTodoListDuplicat (String addtodo){

        var isFull = true;
        for(var i=0; i< data.length;i++){
            if(data[i]!=null){
                isFull=false;
                break;
            }
        }
        if(isFull==true){
            var temporary = data;
            data = new String[data.length*2];
        }

        for(var i=0; i< data.length;i++){
            if(data[i]==null){
                data [i] = addtodo;
                break;

            }
        }

    }
    public static void testaddTodoListduplicat (){
        addTodoListDuplicat("Ini data Todo");
        addTodoListDuplicat("Ini data Todo2");
        addTodoListDuplicat("Ini data Todo3");


    }
    public static void deleteTodoListduplicar(int hapus){
        //data[hapus]=null;
        System.out.println("Menghapus data ke " + hapus);
        for(var i=hapus-1; i< data.length;i++){
            if(i == data.length-1){
                data[i] = null;
            }else
                data[i]= data [i+1];
        }
    }

    public static void testdeleteTodoListduplicat (){
        testaddTodoListduplicat();
        testshowTodoListduplicat();
        deleteTodoListduplicar(3);
        testshowTodoListduplicat();
    }

    public static void input (){

    }




}
