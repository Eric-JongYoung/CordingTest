package BaekJoon.step13_집합과맵.나는야_포켓몬마스터_이다솜;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class N1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> map = new HashMap<>();
        String[] pokemonList = new String[n + 1];
        StringBuilder sb = new StringBuilder();


        for (int i = 1; i < n + 1; i++) {
            String pokemon = br.readLine();
            map.put(pokemon, i);
            pokemonList[i] = pokemon;
        }
        for (int i = 0; i < m; i++) {
            String tmp = br.readLine();
            if(theStringIsNumber(tmp)){
                int idx = Integer.parseInt(tmp);
                sb.append(pokemonList[idx]);
            }else {
                sb.append(map.get(tmp));
            }
            sb.append("\n");
        }
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }

    public static boolean theStringIsNumber(String str){
        try{
            Double.parseDouble(str);
            return true;
        }
        catch (NumberFormatException e){
            return false;
        }
    }
}
