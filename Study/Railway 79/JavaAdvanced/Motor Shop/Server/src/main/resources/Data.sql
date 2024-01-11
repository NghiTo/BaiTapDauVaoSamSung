INSERT INTO Computer (Product_code , Repair_date , Customer_name           , Catalogs         , Brand    )
VALUES               ('29V653'     , '2003-11-16', 'Nguyễn Ngọc Minh Trang', 'Vệ sinh lần 1'  , 'Asus'   ),
                     ('29H158'     , '2023-05-19', 'Lê Bảo Bình'           , 'Nâng RAM'       , 'HP'     ),
                     ('29E888'     , '2019-04-07', 'Nguyễn Thị Thái Hà'    , 'Bảo dưỡng lần 1', 'Lenovo' ),
                     ('29H689'     , '2025-01-29', 'Vũ Đức Long'           , 'Thay pin'       , 'Acer'   ),
                     ('20B643'     , '2006-05-29', 'Vũ Anh Đoán'           , 'Thay sạc'       , 'Dell'   ),
                     ('14B676'     , '2018-03-29', 'Nguyễn Thị Hương'      , 'Sửa màn hình'   , 'Asus'   ),
                     ('90B546'     , '2029-11-29', 'Hoàng Đạo Tĩnh'        , 'Bảo dưỡng lần 2', 'MSI'    ),
                     ('99A216'     , '2002-05-29', 'Phạm Tiến Anh'         , 'Vệ sinh lần 2'  , 'Acer'   ),
                     ('49A516'     , '2002-05-29', 'Nguyễn Ngọc Anh'       , 'Thay chip'      , 'HP'     ),
                     ('11A206'     , '2022-07-21', 'Phạm Văn Hệ'           , 'Thay bàn phím'  , 'Dell'   ),
                     ('80E901'     , '2021-03-05', 'Nguyễn Văn Khoa'       , 'Bảo dưỡng lần 3', 'Lenovo' );

INSERT INTO Accessory (Product_code, Repair_date , Name         , Price  , Status_damaged, Repair_status)
VALUES                ('11A206'    , '2022-07-21', 'Bàn phím'   , 999000 , 'Bị gãy'      , 'Thay mới'   ),
                      ('14B676'    , '2018-03-29', 'Màn hình'   , 199000 , 'Bị bụi bẩn'  , 'Làm sạch'   ),
                      ('20B643'    , '2006-05-29', 'Ổ sạc'      , 2000000, 'Bị thủng'    , 'Thay mới'   ),
                      ('49A516'    , '2002-05-29', 'Pin'        , 1465000, 'Bị hết điện' , 'Sạc điện'   ),
                      ('80E901'    , '2021-03-05', 'Màn hình'   , 369000 , 'Bị vỡ'       , 'Thay màn'   );