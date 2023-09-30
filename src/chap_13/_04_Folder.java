package chap_13;


import java.io.File;

public class _04_Folder {
    public static void main(String[] args) {
        String folderName = "A";
        File folder = new File(folderName);
        folder.mkdir();
        if (folder.exists()) {
            System.out.println("폴더가 존재합니다 : " + folder.getAbsolutePath());
        }

        System.out.println("----------------------------------");

        folderName = "A/B/C";
        // folderName = "A" + File.separator + "B" + File.separator + "C" + File.separator;

        // 윈도우 : C:\\Users\\Nadocoding\\Desktop
        // 맥 : /Users/Nadocoding/Desktop
        folder = new File(folderName);
        folder.mkdirs();
        if (folder.exists()) { // 경로.exists() 경로에 file/directory(folder) 존재 확인
            System.out.println("폴더가 존재합니다 : " + folder.getAbsolutePath());
        } else {
            System.out.println("폴더 생성 실패 (mkdir)");
        }
    }
}
