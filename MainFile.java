package sk.kosickaakademia.stovcikova.files;

public class Main {
    public static void main(String[] args) {
        RWFile rwFile = new RWFile();
        rwFile.copyFileWithCapital("Resource/a.txt");

        rwFile.createFileCesar("Resource/a.txt",-5);

        rwFile.createFileWithoutIorY("Resource/a.txt");

    }
}
