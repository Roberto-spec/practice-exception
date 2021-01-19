package org.itstep.task06;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemAlreadyExistsException;


public class Main {
    public static void main(String[] args) {
        // TODO: проверяйте ваш код здесь
    }
    public static void readXml(XmlReader[] xmlReaders) throws IOException{
        for(int i=0;i<xmlReaders.length;i++){
            try {
                xmlReaders[i].read();
            }catch (FileSystemAlreadyExistsException e){
                throw  new FileNotFoundException();
            }
        }
    }
}
