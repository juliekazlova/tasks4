package by.epam.java.kazlova.task2;

//Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
//консоль текст, заголовок текста.

import java.util.Arrays;
import java.util.Objects;

public class Text {
    private Word name;
    private Sentence[] text;

    public Text(Word name, Sentence[] text) {
        this.name = name;
        this.text = text;
    }

    public Word getName() {
        return name;
    }

    public void setName(Word name) {
        this.name = name;
    }

    public Sentence[] getText() {
        return text;
    }

    public void setText(Sentence[] text) {
        this.text = text;
    }

    public void add(Sentence[] sentences){
        Sentence[] newText= new Sentence[this.text.length+sentences.length];
        for(int i=0; i<this.text.length; i++){
            newText[i]=text[i];
        }
        for(int i=text.length; i<newText.length; i++){
            newText[i]=sentences[i];
        }
        text=newText;
    }

    public void add(String[] sentences){
        Sentence[] newText= new Sentence[this.text.length+sentences.length];
        for(int i=0; i<this.text.length; i++){
            newText[i]=text[i];
        }
        for(int i=text.length; i<newText.length; i++){
            newText[i]=new Sentence(sentences[i]);
        }
        text=newText;
    }

    public String textToString(){
        StringBuilder sb= new StringBuilder();
        for(int i=0; i<text.length; i++){
            sb.append(text[i].getClause()).append(" ");
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Text)) return false;
        Text text1 = (Text) o;
        return Objects.equals(getName(), text1.getName()) &&
                Arrays.equals(getText(), text1.getText());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getName());
        result = 31 * result + Arrays.hashCode(getText());
        return result;
    }
}
