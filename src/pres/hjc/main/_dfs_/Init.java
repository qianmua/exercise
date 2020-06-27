package pres.hjc.main._dfs_;

/**
 * @author HJC
 * @version 1.0
 * 谦谦君子 卑以自牧也
 * @date 2020/6/27  22:54
 * @description :   bfs
 */
public class Init {

    //eg:   a b c
    /**
     * 深度优先搜索
     * 尝试 模拟 stack
     * @param ch
     */
    static void dfs(char[] ch , boolean[] b , int l , char[] res){
        // 截至条件
        if (l == ch.length+1){
            System.out.println(res);
            return;
        }

        //遍历候选节点
        for (int i = 0; i < ch.length; i++) {
            char temp = ch[i];
            if (!b[i]){
                res[i] = temp;
                b[i] = true;
                dfs(ch , b , l+1 , res);
                b[i] = false;
            }
        }
    }

    /**
     * ip demo
     */
    static void def2(String str, int index,int l, String res){
        //截至条件
        if (l == 5 || index== str.length()-1){
            if (l==5 && index == str.length()-1){
                System.out.println(res);
            }
            return;
        }

        //候选
        for (int i = 1; i < 4; i++) {
            int x = Integer.parseInt(str.substring(i));
            if (x < 256 && (x != 0 ) ){
                res += x;
                def2(str,index+i , l+1 , res);
            }
        }

    }

    public static void main(String[] args) {
        /*char[] c = {'A','B','C'};
        boolean[] b = {false,false,false};
        char[] res = new char[3];
        dfs(c,b,1,res);
        */
        String res = "";
        def2("19216801" , -1, 1 , res);
    }
}
