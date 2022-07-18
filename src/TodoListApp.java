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
                System.out.println(no + "." +todo);
            }
        }
    }
    //untuk melakukan test

    public static void testShowTodoList (){
        showTodoList();
    }



    //method menambah todolist
    public static void addTodoList (){

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
