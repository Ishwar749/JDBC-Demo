import java.io.*;
import java.util.*;

public class Solution{
     
     static class pair{
          int row;
          int col;
          
          public pair(int row, int col){
               this.row = row;
               this.col = col;
          }
     }
     
     public static void main(String args[]){
          
          Scanner sc = new Scanner(System.in);
          
          int n = sc.nextInt();
          
          int r1 = sc.nextInt()-1;
          int c1 = sc.nextInt()-1;
          
          int r2 = sc.nextInt()-1;
          int c2 = sc.nextInt()-1;
          
          int grid[][] = new int[n][n];
          
          for(int i = 0; i<n; i++){
        	  String s = sc.next();
               for(int j = 0; j<n; j++){
                    grid[i][j] = s.charAt(j)-'0';
               }
          }
          
          boolean vis[][] = new boolean[n][n];
          
          dfs(r1,c1,grid,vis);
          
          if(vis[r2][c2]){
               System.out.println(0);
          }
          else{
               
               boolean vis2[][] = new boolean[n][n];
               
               dfs(r2,c2,grid,vis2);
               
               List<pair> one = new ArrayList<>();
               List<pair> two = new ArrayList<>();
               
               for(int i = 0; i<n; i++){
                    for(int j = 0; j<n; j++){
                         if(vis[i][j] && hasSeaSide(i,j,grid)){
                              one.add(new pair(i,j));
                         }
                    }
               }
               
               for(int i = 0; i<n; i++){
                    for(int j = 0; j<n; j++){
                         if(vis2[i][j] && hasSeaSide(i,j,grid)){
                              two.add(new pair(i,j));
                         }
                    }
               }
               
               int min = Integer.MAX_VALUE;
               
               for(pair e : one){
                    for(pair f: two){
                         min = Math.min(min,findDis(e,f));
                    }
               }
               
               System.out.println(min);
               
          }
     }
     
     static int findDis(pair a, pair b){
          
          int row = (int)Math.abs(a.row-b.row);
          int col = (int)Math.abs(a.col-b.col);
          
          int dist = row*row + col*col;
          
          return dist;
     }
     
     static boolean hasSeaSide(int i, int j, int grid[][]){
          
          int n = grid.length;
          
          if(i-1>=0){
               if(grid[i-1][j]==1) return true;
          }
          
          if(i+1<n){
               if(grid[i+1][j]==1) return true;
          }
          
          if(j-1>=0){
               if(grid[i][j-1]==1) return true;
          }
          
          if(j+1<n){
               if(grid[i][j+1]==1) return true;
          }
          
          return false;
          
     }
     
     static void dfs(int i, int j, int grid[][], boolean vis[][]){
          
          int n = grid.length;
          
          if(i<0 || i>=n || j<0 || j>=n || grid[i][j]==1 || vis[i][j]==true){
               return;
          }
          
          vis[i][j] = true;
          
          dfs(i-1,j,grid,vis);
          dfs(i+1,j,grid,vis);
          dfs(i,j-1,grid,vis);
          dfs(i,j+1,grid,vis);
     }
}