import java.util.*;
class Solution {
    public int solution(int[][] maps) {
        int answer = 0;
        int n = maps.length;
        int m = maps[0].length;
        int[] dx = {-1,0,1,0};
        int[] dy = {0,-1,0,1};
        boolean[][] visited = new boolean[n][m];
        visited[0][0] = true;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0,0});
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0;i<size;i++){
                int cur[] = q.poll();
                int x = cur[0];
                int y = cur[1];
                for(int j = 0;j<4;j++){
                    int nx = x + dx[j];
                    int ny = y + dy[j];
                    if(nx>=0&&nx<n&&ny>=0&&ny<m){
                        if(maps[nx][ny] == 1 && !visited[nx][ny]){
                            visited[nx][ny] = true;
                            q.offer(new int[]{nx,ny});
                            maps[nx][ny] = maps[x][y] + 1;
                        }
                    }
                }
            }
        }
        if(maps[n-1][m-1] == 1){
            answer = -1;
        }else{
            answer = maps[n-1][m-1];
        }
        return answer;
    }
}