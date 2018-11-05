package com.example.student.cadoc;//選択コースとキャラクターを格納するクラス

public class StoreParameters {
    private String course;  //選択コース
    private String character;   //選択キャラクター
    public String parameters[] = new String[2];     //パラメータ
    StoreParameters(){
    }
    //選択コースを格納するメソッド
    void SetCourse(String Course){
        this.course=Course;
    }
    //選択キャラクターを格納するメソッド
    void SetCharacter(String Character){
        this.character=Character;
    }
    //選択コース、キャラクターを配列に格納し返すメソッド
    String[] GetParameters(){
        parameters[0]=this.course;
        parameters[1]=this.character;
        return parameters;
    }
}
