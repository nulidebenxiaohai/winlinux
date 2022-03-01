package String;

public class KMP {
    private String pat;
    private int[][] dfa;
    public KMP(String pat){
        //用模式字符串构造DFA
        this.pat = pat;
        int M = pat.length();
        int R = 256;
        dfa = new int[R][M];
        dfa[pat.charAt(0)][0] = 1;
        for(int X = 0, j = 1; j < M; j++){
            for(int c = 0; c < R; c++){
                //复制匹配情况下的值
                dfa[c][j] = dfa[c][X];
            }
            //设置匹配成功情况下的值
            dfa[pat.charAt(j)][j] = j+1;
            //更新重启状态
            X = dfa[pat.charAt(j)][X];
        }
    }
    public int search(String txt){
        int i, j, N = txt.length(), M = pat.length();
        for(i = 0, j = 0; i < N && j < M; i++){
            j = dfa[txt.charAt(i)][j];
        }
        //找到匹配（到达模式字符串的结尾）
        if(j == M){
            return i-M;
        }
        //未找到匹配（到达模式字符串的末尾）
        else{
            return N;
        }
    }

    public static void main(String[] args){
        String pat = "abac";
        String txt = "dsfsdfadsabacsdfadfadf";
        KMP kmp = new KMP(pat);
        int offset = kmp.search(txt);
        for (int i = 0; i < offset; i++) {
            System.out.println(" ");
        }
        System.out.println(offset);
    }
}
