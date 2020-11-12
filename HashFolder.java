import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.MessageDigest;

public class hello2 {

    public static byte[] SHA1Checksum(InputStream is) throws Exception {        
        byte[] buffer = new byte[1024];
        MessageDigest complete = MessageDigest.getInstance("SHA-1");
        int numRead;
        do {
            numRead = is.read(buffer);
            if (numRead > 0) {
                complete.update(buffer, 0, numRead);
            }
        } while (numRead != -1);
        is.close();
        return complete.digest();
    }

    public static void dfs(String path) throws Exception {
        File dir = new File("C:\\Users\\irene\\Desktop\\电子书");
        File[] fs = dir.listFiles();
        for(int i = 0; i < fs.length; i++) {
            if(fs[i].isFile()) {
                System.out.println("file " + fs[i].getName());
                String file = fs[i].getAbsolutePath();
                FileInputStream is = new FileInputStream(file);
                byte[] sha = SHA1Checksum(is);

                String result = "";
                for (int j = 0; j < sha.length; j++) {
                    result += Integer.toString(sha[j], 16);
                     }
                System.out.println(result);
            }
            if(fs[i].isDirectory()) {
                System.out.println("directory " + fs[i].getName());
                dfs(path + File.separator + fs[i].getName());
            }
        }
    }
    
    public static void main(String[] args) {
        try {
            dfs("dir");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
