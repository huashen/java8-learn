import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * TestLambda
 *
 * @author longhuashen
 * @since 16/10/12
 */
public class TestLambda {

    @Test
    public void testLambda() throws IOException {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
System.out.println("排序前：" + names);
//        Collections.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        });

        //使用Lambda表达式
        Collections.sort(names, (String a, String b) -> a.compareTo(b));
System.out.println("排序后：" + names);

        RandomAccessFile aFile = new RandomAccessFile("pom.xml", "rw");
        FileChannel inChannel = aFile.getChannel();

        ByteBuffer buf = ByteBuffer.allocate(48);

        int bytesRead = inChannel.read(buf);
        System.out.println("size:" + inChannel.size());
        int sum = 0;
        while (bytesRead != -1) {

            sum += bytesRead;
            System.out.println("Read " + bytesRead + ";;;;");
            buf.flip();

            while(buf.hasRemaining()){
                System.out.print((char) buf.get());
            }

            buf.clear();
            bytesRead = inChannel.read(buf);
        }
        aFile.close();
System.out.println(sum);
    }
}
