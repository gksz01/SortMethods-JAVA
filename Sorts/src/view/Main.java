package view;

import controller.SortController;
import model.DataSetReader;
import java.io.File;

public class Main {
    public static void main(String[] args)throws Exception{
        String base="..\\SortMethods-JAVA\\Sorts\\src\\datas";

        String[] files=new File(base).list();

        String[] algos={"bubble","insertion","quick"};

        for(String f:files){
            int[] data=DataSetReader.readCsv(base+"/"+f);

            System.out.println("Arquivo: "+f);

            for(String a:algos){
                long t = SortController.runSort(a,data);

                System.out.println("  "+a+" -> "+t+" ns");
            }
        }
    }
}
