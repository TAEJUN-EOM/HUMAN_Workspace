import sys
from pyspark import SparkContext, SparkConf

if __name__=="__main__" :
    sc = SparkContext("local", "PySpark Word Count Example")
    words = sc.textfile('d:/workspace/spark/input.txt').flatMap(lambda line: line.split(""))
    wordCounts = words.map(lambda word : (word, 1)).reduceByKey(lambda : a, b: a , +b)
    wordCounts.saveAsTextFile("d:/workspace/spark/output/")