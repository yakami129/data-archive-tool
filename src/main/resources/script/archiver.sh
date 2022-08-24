/opt/homebrew/bin/pt-archiver
--source h=192.168.3.15,u=root,p=123qweASD,P=3306,D=itsmboot-ht,t=itsm_service_work_list
--dest h=192.168.3.15,P=3306,u=root,p=123qweASD,D=itsmboot_archive,t=itsm_service_work_list
--progress 5000 --where "end_date<'2022-08-27'"  --statistics --charset=UTF8 --limit=10000 --txn-size 1000 --bulk-delete