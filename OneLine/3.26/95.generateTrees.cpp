/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    vector<TreeNode*> generateTrees(int start ,int end){
        if (start > end){
            return {nullptr};
        }
        vector<TreeNode* > allTrees;
        for (int i=start ; i<=end; i++){
            vector<TreeNode*> leftTrees = generateTrees(start,i-1);
            vector<TreeNode*> rightTrees = generateTrees(i+1,end);
            //auto根据后面的值推测自己前面的类型是什么
            //对于leftTrees中每一个节点 left是一个引用
            for (auto &left :leftTrees){
                for(auto &right :rightTrees){
                    TreeNode* currTree = new TreeNode(i);
                    currTree ->left = left;
                    currTree -> right = right;
                    allTrees.emplace_back(currTree);
                    //emplace_back 与push_back 功能相同 底层结构不同
                    //emplace_back 是直接在vector尾部增加
                    //push_back 是先创建新元素 再拷贝or移动到容器尾部

                }
            }
        }
        return allTrees;
    }

    vector<TreeNode*> generateTrees(int n) {
        if (!n){
            return {};
        }
        return generateTrees(1,n);
    }
};
