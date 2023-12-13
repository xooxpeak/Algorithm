class Solution {
    public String solution(String[] id_pw, String[][] db) {
        for(int i=0; i<db.length; i++) {
            if(db[i][0].equals(id_pw[0])) {  // 아이디가 같다면
                if(db[i][1].equals(id_pw[1])) {  // 비밀번호도 같다면
                    return "login";
                } else return "wrong pw";
            }
        }
        return "fail";
    }
}