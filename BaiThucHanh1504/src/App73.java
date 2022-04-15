import Static.ToaDo;

public class App73 {
    public static void main(String [] args){
        //Các thuộc tính x,y này chỉ được truy xuất đến thông qua thể hiện toado1
        ToaDo toado1 = new ToaDo();
        toado1.x = 10;
        toado1.y = 20;

        //Các thuộc tính x,y này chỉ được truy xuất đến thông qua thể hiện toado2
        ToaDo toado2 = new ToaDo();
        toado2.x = 5;
        toado2.y = 6;

        //Thuộc tính ThongTin lại được truy xuất thông qua lớp ToaDo
        ToaDo.ThongTin = "Lưu tọa độ các hình học";
    }
}
