class Solution {
public:
    struct Node{
        int x,y;
    };
    int t[8][2] = {{1,0},{-1,0},{0,1},{0,-1},{1,1},{1,-1},{-1,1},{-1,-1}};
    int shortestPathBinaryMatrix(vector<vector<int>>& grid) {
        int ans = 0;
        queue<Node> q;
        int m = grid.size();
        int n = grid[0].size(); 
        if (grid[0][0] ==1 || grid[m-1][n-1]==1)return -1;
        vector<vector<int>> mem(m,vector<int>(n,0));
        q.push({0,0});
        mem[0][0] = 1;
        Node nextNode;
        while (!q.empty()){
            int size = q.size();
            for (int i=0;i<size;i++)
            {
                Node currentNode = q.front();
                int x = currentNode.x;
                int y = currentNode.y;
                if (x==(n-1) && y==(m-1)){
                    return ans+1;
                }
                for (int j=0;j<8;j++)
                {
                    nextNode.x = x + t[j][0];
                    nextNode.y = y + t[j][1];
                    if (nextNode.x <m && nextNode.y <n && nextNode.x>=0 && nextNode.y >=0 && grid[nextNode.x][nextNode.y]==0 && mem[nextNode.x][nextNode.y]==0)
                    {
                         mem[nextNode.x][nextNode.y] =1;
                        q.push(nextNode);
                    }
                }
                q.pop();
            }
            ans++;
        }
        return -1;
    }
};
