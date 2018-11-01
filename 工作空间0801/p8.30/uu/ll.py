#  -*- coding: UTF-8 -*-
# 1
# if语句===========
# if语句
Key=False 
if Key==True:
    print "Answer"
    print "True"
else:
    print "Answer"
    print "False"
# Answer
# False
# 多行语句 ===================================
# 多行语句 
# Python语句中一般以新行作为语句的结束符。
# 但是我们可以使用斜杠（ \）将一行的语句分为多行显示，如下所示：
kk="kk"+\
   "l"+\
   "l"
print kk
# kkll
# 语句中包含 [], {} 或 () 括号就不需要使用多行连接符。如下实例：
days = ['Monday', 'Tuesday', 'Wednesday',
         'Thursday', 'Friday']
print days
# ['Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday']

# Python注释============
# python中单行注释采用 # 开头。

# Python 引号=======================================================================
# Python 可以使用引号( ' )、双引号( " )、三引号( ''' 或 """ ) 来表示字符串，引号的开始与结束必须的相同类型的。
# 其中三引号可以由多行组成，编写多行文本的快捷语法，常用于文档字符串，在文件的特定地点，被当做注释。
word = 'word'
sentence = "这是一个句子。"
paragraph = """这是一个段落。
包含了多个语句"""
print word
print sentence
print paragraph
# word
# 这是一个句子。
# 这是一个段落。
# 包含了多个语句





   
    
    


