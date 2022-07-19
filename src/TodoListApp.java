public class TodoListApp {

    public static String [] model = new String[10];
    public static java.util.Scanner scanner = new java.util.Scanner(System.in );
    public static void main(String[] args) {

       // testShowTodoList();

        testInput();
    }

    //method menampilkan todolist
    public static void showTodoList(){
        for(int i=0;i < model.length; i++){
            var todo = model [i];
            var no = i+1;

            if(todo!=null){
                System.out.println(no + ". " +todo);
            }
        }
    }
    //untuk melakukan test

    public static void testShowTodoList (){
        model[0] = "belajar Java Dasar";
        model[1] = "membuat Aplikasi TodoList";
        model[2] = "ini yang akan dihapus";
        model[3]  = "ini data ke empat";
        model[4] = "ini nomor 5";
        showTodoList();
    }



    //method menambah todolist
    public static void addTodoList (String addtodo){

        var isFull = true;
        for(int i=0 ; i< model.length;i++){
            if(model[i]==null){
                //model masih ada yang kosong
                isFull = false;
                break;
            }
        }

        //jika penuh maka kita resize ukuran array dua kali lipat

        if(isFull == true){
            var temp = model;  //ini untuk menyimpan data lama ke sebuah variabel

            model = new String[model.length*2]; // ini untuk resize panjang array "semua array akan di hilangkan

            for (var i=0 ; i< temp.length;i++){
                model [i] = temp [i];
            }

        }

        //untuk menambahkan data ketodo
        for(var i=0 ; i< model.length; i++){
            if(model[i]==null){
                model[i] = addtodo;
                break;
            }
        }
    }

    public static void testaddTodoList (){
        for(var i=0;i< 25;i++){
            addTodoList("contoh ke ." +i);
        }
        showTodoList();

    }


    //menghapus todoList
    public static boolean removeTodoList(int posisi){

        if(posisi-1 > model.length){
            return false;

        }
        if(model[posisi-1]==null){
            return false;
        }
        else {
           // model[posisi-1] =null;

            for (int i=posisi-1;i< model.length;i++){
                if(i== model.length-1){
                    model[i]=null;
                }else
                model[i] = model [i+1];
            }
            return true;
        }



        /*
        for(var i=0 ; i< model.length; i++){
            if(i==posisi-1){
                model[i] = null;
                break;
            }
        }
        */

    }

    public static void testremoveTodoList (){
        testShowTodoList();
        var result = removeTodoList(25);
        System.out.println(result);
        showTodoList();
        result = removeTodoList(2);
        System.out.println(result);
        showTodoList();
    }

    public static String input (String info){

    System.out.print(info + ": ");
    String data = scanner.nextLine();
    return data;
    }

    public static void testInput (){
        var name = input("Nama");
        System.out.println("Hi " + name);
        var channel = input ("Channel");
        System.out.print("Hi " + channel);
    }
    //---------------------------

    //Dibawah ini adalah view dari menampilkan todolist
    public static void viewShowTodoList (){
    while (true){
        showTodoList();
        System.out.println("Menu :");
        System.out.println("1. Tambah");
        System.out.println("2. Hapus");
        System.out.println("x. Keluar");

        var input = input("Pilih");
        if(input.equals("1")){
            viewAddTodoList();
        }
        else if (input.equals("2")){
            viewRemoveTodoList();
        } else if (input.equals("x")) {
            break;

        } else {
            System.out.println("Pilihan Tidak dimengerti");
        }

    }
    }

    //Dibawah ini adalah view dari menambahkan todolist
    public static void viewAddTodoList (){

    }

    //Dibawah ini adalah view dari menghapus todolist
    public static void viewRemoveTodoList (){

    }
}
