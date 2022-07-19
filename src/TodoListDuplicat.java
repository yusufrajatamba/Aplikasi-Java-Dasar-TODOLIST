
public class TodoListDuplicat {

    public static String [] data = new String[10];
     public static java.util.Scanner scan = new java.util.Scanner(System.in );

    public static void main(String[] args) {

    viewShowTodoList();
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

    public static String input(String data){

        System.out.print(data +":");
        var input = scan.nextLine();

        return input;
    }
    public static void testinput(){

        var data =input("Masukkan Nama");
        System.out.println("Hi "+ data);
        addTodoListDuplicat(data);
        showTodoListduplicat();
    }

    public static void viewShowTodoList (){
        while(true){
            System.out.println(" TODOLIST Anda");

            showTodoListduplicat();
            System.out.println("Menu :");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Stop Program");
            var data = input("Masukkan Pilihan" );
            if(data.equals("1") ){
                viewaddtodolist();
            } else if (data.equals("2")) {
                viewRemoveTodoList();
            } else if (data.equals("x")) {
                break;
            }else {
                System.out.println("System tidak mengenal input");
            }

        }
    }
    public static void viewaddtodolist (){

        System.out.println("Menambahkan Todo ");
        var data = input("Todo (x = batal)");

        if(data.equals("x")){

        }else
        addTodoListDuplicat(data);
    }
    public static void viewRemoveTodoList (){
        System.out.println("Remove data Todo");
        var data = input("Todo (x = batal) ");

        if(data.equals("x")){

        }else{
           deleteTodoListduplicar(Integer.valueOf(data));
        }
    }
    }




