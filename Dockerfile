FROM python

WORKDIR /python/demo1

COPY . . 

CMD ["python" ,"pythondemo.py"]