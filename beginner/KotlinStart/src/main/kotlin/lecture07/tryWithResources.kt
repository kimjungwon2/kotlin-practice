package lecture07

import java.io.BufferedReader
import java.io.FileReader

class FilePrinters{
    fun readFile(path: String){
        BufferedReader(FileReader(path)).use {
            reader->
            println(reader.readLine())
        }
    }
}