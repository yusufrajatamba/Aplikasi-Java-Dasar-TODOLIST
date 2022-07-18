public class TodoListApp {

    public static String [] model = new String[10];

    public static void main(String[] args) {

       // testShowTodoList();

        testremoveTodoList();
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
            model[posisi-1] =null;
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
        var result = removeTodoList(2);
        System.out.println(result);
        showTodoList();
        result = removeTodoList(3);
        System.out.println(result);
        showTodoList();
    }

    //---------------------------

    //Dibawah ini adalah view dari menampilkan todolist
    public static void viewShowTodoList (){

    }

    //Dibawah ini adalah view dari menambahkan todolist
    public static void viewAddTodoList (){

    }

    //Dibawah ini adalah view dari menghapus todolist
    public static void viewRemoveTodoList (){

    }
}
