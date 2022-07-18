public class TodoListApp {

    public static String [] model = new String[10];

    public static void main(String[] args) {

        testShowTodoList();
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


    //menghapus todoList
    public static void removeTodoList(){

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
