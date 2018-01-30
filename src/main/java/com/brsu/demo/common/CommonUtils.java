package com.brsu.demo.common;

import java.io.*;
import java.lang.reflect.Field;

/**
 * Created by brsu on 2017/8/11.
 */
public class CommonUtils {

    public static void checkCond(Object obj) {
        Field[] fields = obj.getClass().getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            Field f = fields[i];
            f.setAccessible(true);
            try {
                if ("".equals(f.get(obj))) {
                    f.set(obj, null);
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

//    public static List<TreeNode> fillTree(Map<String, TreeNode> treeNodes) {
//        List<TreeNode> list = new ArrayList<>(); // 定义一个树形结构实体
//        for (Map.Entry<String, TreeNode> entry : treeNodes.entrySet()) {
//            TreeNode treeNode = entry.getValue();
//            if (treeNode != null) {
//                String id = treeNode.getId();
//                String parentId = treeNode.getParentId();
//                TreeNode tempNode = treeNodes.get(id);
//                if (list.isEmpty()) {
//                    list.add(tempNode);
//                } else {
//                    TreeNode pNode = treeNodes.get(parentId);
//                    if (pNode != null) {
//                        pNode.addChild(tempNode);
//                    }
//
//
//                }
//            }
//        }
//        return list; // 返回树形结构list集合
//    }

    /**
     * 写文件
     * @param pathName
     * @param json
     */
    public static void writeJson(String pathName, String json){
        Writer write = null;
        try {
            File file = new File(pathName);
            write = new FileWriter(file);
            write.write(json);
            write.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            close(write);
        }
    }

    /**
     * 关闭流
     * @param c
     */
    public static void close(Closeable c){
        if(c != null){
            try {
                c.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
