package strings;

/**
 * Created by Spandana.K on 19-07-2021.
 */
public class StringBufferAndBuilder {

    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("hello");
        System.out.println(stringBuffer);
        stringBuffer.append("world");
        System.out.println(stringBuffer);

        long startTime = System.currentTimeMillis();
        StringBuffer stringBufferTest = new StringBuffer("java");
        for (int i=0; i <100000; i++){
            stringBufferTest.append("test");
        }
        System.out.println("BUFFER: time taken: "+ (System.currentTimeMillis() - startTime)+"ms");
        startTime = System.currentTimeMillis();
        StringBuilder stringBuilderTest = new StringBuilder("java");
        for (int i=0; i <100000; i++){
            stringBuilderTest.append("test");
        }
        System.out.println("BUILDER: time taken: "+ (System.currentTimeMillis() - startTime)+"ms");

    }

}
