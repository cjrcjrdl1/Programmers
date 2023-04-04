import java.util.*;
class Solution {
    public int solution(int[][] maps) {
        int answer = 0;
        int n = maps.length;
        int m = maps[0].length;
        int[] dx = {-1,0,1,0}; //x좌표 이동 배열
        int[] dy = {0,1,0,-1}; //y좌표 이동 배열
        
        //시작 지점 (0,0)에서 출발하여 BFS 탐색
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {0,0});
        
        //방문한 지점을 체크하는 배열 생성
        boolean[][] visited = new boolean[n][m];
        visited[0][0] = true;
        
        while(!q.isEmpty()){
            int size = q.size();
            for(int i =0;i<size;i++){
                int[] cur = q.poll();
                int x = cur[0];
                int y = cur[1];
                //현재 지점에서  상하좌우로 이동 가능한 지점을 확인
                for(int j =0;j<4;j++){
                    int nx = x + dx[j];
                    int ny = y + dy[j];
                    //이동 가능한 범위 내에 있는 경우
                    if(nx>=0 && nx<n && ny>=0 && ny<m){
                        //이동 가능한 지점이 벽이 아니고 방문하지 않았다면 큐에 추가
                        if(maps[nx][ny] == 1 && !visited[nx][ny]){
                            visited[nx][ny] = true;
                            q.offer(new int[] {nx, ny});
                            //해당 지점까지의 최단 거리 계산
                            maps[nx][ny] = maps[x][y] + 1;
                        }
                    }
                }
            }
        }
        
        // (n-1, m-1)까지의 최단 거리 반환
        if(maps[n-1][m-1]==1){
            answer = -1;
        }else{
            answer = maps[n-1][m-1];
        }
        return answer;
    }
}