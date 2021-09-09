CREATE DATABASE [db]
GO

USE [db]
GO

--Tao bang Nhom su kien
CREATE TABLE [dbo].[NHOMSUKIEN](
[MaNhom] [char](10) NOT NULL PRIMARY KEY,
[TenNhom] [nvarchar](25) NOT NULL
)

--Tao bang Su kien
CREATE TABLE [dbo].[SUKIEN](
[MaSuKien] [char](10) NOT NULL,
[MaNhom] [char](10) NOT NULL,
[NoiDung] [nvarchar](120) NOT NULL
)

--Tao bang Tap Luat
CREATE TABLE [dbo].[TAPLUAT](
[MaLuat] [int] IDENTITY(1,1) NOT NULL,
[GiaThiet] [nvarchar](50) NOT NULL,
[KetLuan] [nvarchar](25) NOT NULL,
CONSTRAINT [PK_TAPLUATs] PRIMARY KEY CLUSTERED 
(
[MaLuat] ASC
) WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

--Them khoa ngoai
ALTER TABLE [dbo].[SUKIEN] 
	WITH CHECK ADD CONSTRAINT [FK_SUKIENs_NHOMSK] FOREIGN KEY([MaNhom])
	REFERENCES [dbo].[NhomSuKien] ([MaNhom])
GO


--Them du lieu vao csdl
INSERT INTO [dbo].[NHOMSUKIEN](MaNhom,TenNhom) VALUES ('nhom1',N'Mùa')
INSERT INTO [dbo].[NHOMSUKIEN](MaNhom,TenNhom) VALUES ('nhom2',N'Buổi')
INSERT INTO [dbo].[NHOMSUKIEN](MaNhom,TenNhom) VALUES ('nhom3',N'Nguyên liệu')
INSERT INTO [dbo].[NHOMSUKIEN](MaNhom,TenNhom) VALUES ('nhom4',N'Món ăn')
INSERT INTO [dbo].[NHOMSUKIEN](MaNhom,TenNhom) VALUES ('nhom5',N'Kết luận')

INSERT INTO [dbo].[SUKIEN] VALUES ('m1','nhom1',N'Xuân')
INSERT INTO [dbo].[SUKIEN] VALUES ('m2','nhom1',N'Hè')
INSERT INTO [dbo].[SUKIEN] VALUES ('m3','nhom1',N'Thu')
INSERT INTO [dbo].[SUKIEN] VALUES ('m4','nhom1',N'Đông')

INSERT INTO [dbo].[SUKIEN] VALUES ('b1','nhom2',N'Buổi sáng')
INSERT INTO [dbo].[SUKIEN] VALUES ('b2','nhom2',N'Buổi trưa')
INSERT INTO [dbo].[SUKIEN] VALUES ('b3','nhom2',N'Buổi tối')

INSERT INTO [dbo].[SUKIEN] VALUES ('nl1','nhom3',N'Thịt bò')
INSERT INTO [dbo].[SUKIEN] VALUES ('nl2','nhom3',N'Mỳ tôm')
INSERT INTO [dbo].[SUKIEN] VALUES ('nl3','nhom3',N'Thịt gà')
INSERT INTO [dbo].[SUKIEN] VALUES ('nl4','nhom3',N'Cá')
INSERT INTO [dbo].[SUKIEN] VALUES ('nl5','nhom3',N'Khổ qua')
INSERT INTO [dbo].[SUKIEN] VALUES ('nl6','nhom3',N'Bầu')
INSERT INTO [dbo].[SUKIEN] VALUES ('nl7','nhom3',N'Tôm')
INSERT INTO [dbo].[SUKIEN] VALUES ('nl8','nhom3',N'Cua')
INSERT INTO [dbo].[SUKIEN] VALUES ('nl9','nhom3',N'Thịt lợn')
INSERT INTO [dbo].[SUKIEN] VALUES ('nl10','nhom3',N'Bí đỏ')
INSERT INTO [dbo].[SUKIEN] VALUES ('nl11','nhom3',N'Sườn')
INSERT INTO [dbo].[SUKIEN] VALUES ('nl12','nhom3',N'Miến rong')
INSERT INTO [dbo].[SUKIEN] VALUES ('nl13','nhom3',N'Rau muống')
INSERT INTO [dbo].[SUKIEN] VALUES ('nl14','nhom3',N'Rau cải')
INSERT INTO [dbo].[SUKIEN] VALUES ('nl15','nhom3',N'Trứng')
INSERT INTO [dbo].[SUKIEN] VALUES ('nl16','nhom3',N'Nấm hương')
INSERT INTO [dbo].[SUKIEN] VALUES ('nl17','nhom3',N'Đậu hũ')
INSERT INTO [dbo].[SUKIEN] VALUES ('nl18','nhom3',N'Cà chua')
INSERT INTO [dbo].[SUKIEN] VALUES ('nl19','nhom3',N'Cốm')
INSERT INTO [dbo].[SUKIEN] VALUES ('nl20','nhom3',N'Ngũ cốc')
INSERT INTO [dbo].[SUKIEN] VALUES ('nl21','nhom3',N'Sữa')
INSERT INTO [dbo].[SUKIEN] VALUES ('nl22','nhom3',N'Bánh mì')
INSERT INTO [dbo].[SUKIEN] VALUES ('nl23','nhom3',N'Táo')
INSERT INTO [dbo].[SUKIEN] VALUES ('nl24','nhom3',N'Dưa hấu')
INSERT INTO [dbo].[SUKIEN] VALUES ('nl25','nhom3',N'Bưởi')
INSERT INTO [dbo].[SUKIEN] VALUES ('nl26','nhom3',N'Cam')
INSERT INTO [dbo].[SUKIEN] VALUES ('nl27','nhom3',N'Bún')
INSERT INTO [dbo].[SUKIEN] VALUES ('nl28','nhom3',N'Gạo')

INSERT INTO [dbo].[SUKIEN] VALUES ('mon1','nhom4',N'Canh khổ qua nhồi thịt')
INSERT INTO [dbo].[SUKIEN] VALUES ('mon2','nhom4',N'Canh bầu nấu tôm')
INSERT INTO [dbo].[SUKIEN] VALUES ('mon3','nhom4',N'Canh cua mồng tơi')
INSERT INTO [dbo].[SUKIEN] VALUES ('mon4','nhom4',N'Canh bí đỏ ninh xương')
INSERT INTO [dbo].[SUKIEN] VALUES ('mon5','nhom4',N'Rau cải xào')
INSERT INTO [dbo].[SUKIEN] VALUES ('mon6','nhom4',N'Đậu sốt cà chua')
INSERT INTO [dbo].[SUKIEN] VALUES ('mon7','nhom4',N'Thịt kho tàu')
INSERT INTO [dbo].[SUKIEN] VALUES ('mon8','nhom4',N'Gà rang xả ớt')
INSERT INTO [dbo].[SUKIEN] VALUES ('mon9','nhom4',N'Rau muống luộc')
INSERT INTO [dbo].[SUKIEN] VALUES ('mon10','nhom4',N'Sườn xào chua ngọt')
INSERT INTO [dbo].[SUKIEN] VALUES ('mon11','nhom4',N'Canh chua cá lóc')
INSERT INTO [dbo].[SUKIEN] VALUES ('mon12','nhom4',N'Miến xào thịt bằm')
INSERT INTO [dbo].[SUKIEN] VALUES ('mon13','nhom4',N'Chả cốm')
INSERT INTO [dbo].[SUKIEN] VALUES ('mon14','nhom4',N'Súp gà nấm hương')
INSERT INTO [dbo].[SUKIEN] VALUES ('mon15','nhom4',N'Dưa muối')
INSERT INTO [dbo].[SUKIEN] VALUES ('mon16','nhom4',N'Bún chả')
INSERT INTO [dbo].[SUKIEN] VALUES ('mon17','nhom4',N'Trứng rán')
INSERT INTO [dbo].[SUKIEN] VALUES ('mon18','nhom4',N'Thịt nướng')
INSERT INTO [dbo].[SUKIEN] VALUES ('mon19','nhom4',N'Lẩu')
INSERT INTO [dbo].[SUKIEN] VALUES ('mon20','nhom4',N'Nước ép')
INSERT INTO [dbo].[SUKIEN] VALUES ('mon21','nhom4',N'Bánh mì thịt')
INSERT INTO [dbo].[SUKIEN] VALUES ('mon22','nhom4',N'Bánh mì trứng')
INSERT INTO [dbo].[SUKIEN] VALUES ('mon23','nhom4',N'Cơm')
INSERT INTO [dbo].[SUKIEN] VALUES ('mon24','nhom4',N'Bò xào nấm')
INSERT INTO [dbo].[SUKIEN] VALUES ('mon25','nhom4',N'Canh chua thịt băm')
INSERT INTO [dbo].[SUKIEN] VALUES ('mon26','nhom4',N'Mỳ xào thịt bò')

INSERT INTO [dbo].[SUKIEN] VALUES ('KL1','nhom5',N'Canh khổ qua nhồi thịt, bò xào nấm, bưởi,cơm')
INSERT INTO [dbo].[SUKIEN] VALUES ('KL2','nhom5',N'Rau cải xào, súp gà nấm hương, trứng rán, cơm, táo')
INSERT INTO [dbo].[SUKIEN] VALUES ('KL3','nhom5',N'Canh bí đỏ ninh sương, đậu sốt cà chua, cơm, dưa hấu')
INSERT INTO [dbo].[SUKIEN] VALUES ('KL4','nhom5',N'Canh chua cá lóc, đậu sót cà chua, cam,cơm')
INSERT INTO [dbo].[SUKIEN] VALUES ('KL5','nhom5',N'Canh bầu nấu tôm, sườn sào chua ngọt, dưa hấu,cơm')
INSERT INTO [dbo].[SUKIEN] VALUES ('KL6','nhom5',N'Thịt nướng, nước ép, dưa muối')
INSERT INTO [dbo].[SUKIEN] VALUES ('KL7','nhom5',N'Canh cua mồng tơi,bò xào nấm,dưa muối,cam,cơm')
INSERT INTO [dbo].[SUKIEN] VALUES ('KL8','nhom5',N'Lẩu, nước ép, mỳ tôm')
INSERT INTO [dbo].[SUKIEN] VALUES ('KL9','nhom5',N'Canh chua thịt băm, sường xào chua ngọt, bưởi,cơm')
INSERT INTO [dbo].[SUKIEN] VALUES ('KL10','nhom5',N'Súp gà nấm hương, gà rang xả ớt, cơm, rau cải xào, dưa hấu')
INSERT INTO [dbo].[SUKIEN] VALUES ('KL11','nhom5',N'Canh bí đỏ ninh xương, thịt kho tàu, chả cốm,cơm')
INSERT INTO [dbo].[SUKIEN] VALUES ('KL12','nhom5',N'Rau muống luộc,trứng rán, gà rang xả ớt, dưa hấu,cơm')
INSERT INTO [dbo].[SUKIEN] VALUES ('KL13','nhom5',N'Bánh mì thịt, nước ép')
INSERT INTO [dbo].[SUKIEN] VALUES ('KL14','nhom5',N'Mỳ xào thịt bò, nước ép')
INSERT INTO [dbo].[SUKIEN] VALUES ('KL15','nhom5',N'Ngũ cốc, sữa, táo')
INSERT INTO [dbo].[SUKIEN] VALUES ('KL16','nhom5',N'Bún chả, dưa hấu')
INSERT INTO [dbo].[SUKIEN] VALUES ('KL17','nhom5',N'Bún thịt nướng, táo')
INSERT INTO [dbo].[SUKIEN] VALUES ('KL18','nhom5',N'Bánh mì trứng, sữa')

INSERT INTO [dbo].[TAPLUAT]([GiaThiet],[KetLuan]) VALUES ('mon6^mon24^nl25^mon23^b2','KL1')
INSERT INTO [dbo].[TAPLUAT]([GiaThiet],[KetLuan]) VALUES ('mon5^mon14^mon17^mon23^nl23^b2','KL2')
INSERT INTO [dbo].[TAPLUAT]([GiaThiet],[KetLuan]) VALUES ('mon4^mon6^mon23^nl24^b2','KL3')
INSERT INTO [dbo].[TAPLUAT]([GiaThiet],[KetLuan]) VALUES ('mon11^mon6^mon23^nl26^b2','KL4')
INSERT INTO [dbo].[TAPLUAT]([GiaThiet],[KetLuan]) VALUES ('mon2^mon10^mon23^nl24^b2','KL5')
INSERT INTO [dbo].[TAPLUAT]([GiaThiet],[KetLuan]) VALUES ('mon18^mon15^mon20^b3','KL6')
INSERT INTO [dbo].[TAPLUAT]([GiaThiet],[KetLuan]) VALUES ('mon3^mon24^mon15^nl26^mon23^b3','KL7')
INSERT INTO [dbo].[TAPLUAT]([GiaThiet],[KetLuan]) VALUES ('mon19^mon20^nl2^b3','KL8')
INSERT INTO [dbo].[TAPLUAT]([GiaThiet],[KetLuan]) VALUES ('mon25^mon10^nl25^mon23^b3','KL9')
INSERT INTO [dbo].[TAPLUAT]([GiaThiet],[KetLuan]) VALUES ('mon14^mon8^mon23^mon5^nl24^b3','KL10')
INSERT INTO [dbo].[TAPLUAT]([GiaThiet],[KetLuan]) VALUES ('mon4^mon7^mon13^mon23^b3','KL11')
INSERT INTO [dbo].[TAPLUAT]([GiaThiet],[KetLuan]) VALUES ('mon9^mon17^mon8^nl24^mon23^b3','KL12')
INSERT INTO [dbo].[TAPLUAT]([GiaThiet],[KetLuan]) VALUES ('mon21^mon20^b1','KL13')
INSERT INTO [dbo].[TAPLUAT]([GiaThiet],[KetLuan]) VALUES ('mon20^mon26^b1','KL14')
INSERT INTO [dbo].[TAPLUAT]([GiaThiet],[KetLuan]) VALUES ('nl20^nl21^nl23^b1','KL15')
INSERT INTO [dbo].[TAPLUAT]([GiaThiet],[KetLuan]) VALUES ('b1^nl24^n27^mon13','KL16')
INSERT INTO [dbo].[TAPLUAT]([GiaThiet],[KetLuan]) VALUES ('b1^nl27^nl23^mon18','KL17')
INSERT INTO [dbo].[TAPLUAT]([GiaThiet],[KetLuan]) VALUES ('b1^nl15^nl21^nl22','KL18')
INSERT INTO [dbo].[TAPLUAT]([GiaThiet],[KetLuan]) VALUES ('nl5^nl9','mon1')
INSERT INTO [dbo].[TAPLUAT]([GiaThiet],[KetLuan]) VALUES ('nl6^nl7','mon2')
INSERT INTO [dbo].[TAPLUAT]([GiaThiet],[KetLuan]) VALUES ('m2^b3','mon3')
INSERT INTO [dbo].[TAPLUAT]([GiaThiet],[KetLuan]) VALUES ('nl10^nl11','mon4')
INSERT INTO [dbo].[TAPLUAT]([GiaThiet],[KetLuan]) VALUES ('nl14','mon5')
INSERT INTO [dbo].[TAPLUAT]([GiaThiet],[KetLuan]) VALUES ('nl16^nl17','mon6')
INSERT INTO [dbo].[TAPLUAT]([GiaThiet],[KetLuan]) VALUES ('m4','mon7')
INSERT INTO [dbo].[TAPLUAT]([GiaThiet],[KetLuan]) VALUES ('nl3','mon8')
INSERT INTO [dbo].[TAPLUAT]([GiaThiet],[KetLuan]) VALUES ('nl13','mon9')
INSERT INTO [dbo].[TAPLUAT]([GiaThiet],[KetLuan]) VALUES ('nl10','mon10')
INSERT INTO [dbo].[TAPLUAT]([GiaThiet],[KetLuan]) VALUES ('m2^nl4','mon11')
INSERT INTO [dbo].[TAPLUAT]([GiaThiet],[KetLuan]) VALUES ('b1^nl9^nl12','mon12')
INSERT INTO [dbo].[TAPLUAT]([GiaThiet],[KetLuan]) VALUES ('nl9^nl19^m3','mon13')
INSERT INTO [dbo].[TAPLUAT]([GiaThiet],[KetLuan]) VALUES ('nl3^nl15^nl16^m4','mon14')
INSERT INTO [dbo].[TAPLUAT]([GiaThiet],[KetLuan]) VALUES ('m2^b3','mon15')
INSERT INTO [dbo].[TAPLUAT]([GiaThiet],[KetLuan]) VALUES ('b1','mon16')
INSERT INTO [dbo].[TAPLUAT]([GiaThiet],[KetLuan]) VALUES ('nl15','mon17')
INSERT INTO [dbo].[TAPLUAT]([GiaThiet],[KetLuan]) VALUES ('b3^nl9','mon18')
INSERT INTO [dbo].[TAPLUAT]([GiaThiet],[KetLuan]) VALUES ('m4','mon19')
INSERT INTO [dbo].[TAPLUAT]([GiaThiet],[KetLuan]) VALUES ('nl23','mon20')
INSERT INTO [dbo].[TAPLUAT]([GiaThiet],[KetLuan]) VALUES ('nl22','mon21')
INSERT INTO [dbo].[TAPLUAT]([GiaThiet],[KetLuan]) VALUES ('nl22^nl15','mon22')
INSERT INTO [dbo].[TAPLUAT]([GiaThiet],[KetLuan]) VALUES ('nl28','mon23')
INSERT INTO [dbo].[TAPLUAT]([GiaThiet],[KetLuan]) VALUES ('nl1^nl16','mon24')
INSERT INTO [dbo].[TAPLUAT]([GiaThiet],[KetLuan]) VALUES ('nl9^nl18','mon25')
INSERT INTO [dbo].[TAPLUAT]([GiaThiet],[KetLuan]) VALUES ('nl1^nl2^m1','mon26')
INSERT INTO [dbo].[TAPLUAT]([GiaThiet],[KetLuan]) VALUES ('b1','nl22')
INSERT INTO [dbo].[TAPLUAT]([GiaThiet],[KetLuan]) VALUES ('b1','nl21')
INSERT INTO [dbo].[TAPLUAT]([GiaThiet],[KetLuan]) VALUES ('b3','mon19')
INSERT INTO [dbo].[TAPLUAT]([GiaThiet],[KetLuan]) VALUES ('m1','mon26')
INSERT INTO [dbo].[TAPLUAT]([GiaThiet],[KetLuan]) VALUES ('b2','KL16')
INSERT INTO [dbo].[TAPLUAT]([GiaThiet],[KetLuan]) VALUES ('b1','KL18')

-------------------------------------
SELECT * FROM [dbo].[NHOMSUKIEN]

SELECT * FROM [dbo].[SUKIEN] 
WHERE [MaNhom]='nhom5'

SELECT * FROM [dbo].[TAPLUAT]

select * from [User] where username='abc' and password='123'

update [User] set role=0 where username='abc'

insert into sukien values ('','nhom3','?')

insert into sukien values (1,'nhom3',1)

select * from SUKIEN where MaSuKien='1'

select * from TAPLUAT

INSERT INTO [dbo].[TAPLUAT]([GiaThiet],[KetLuan]) VALUES ('a','a')

delete TAPLUAT where MaLuat=51

update tapluat set [GiaThiet]='b', [KetLuan]='b' where maluat=53













