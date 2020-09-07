package com.sjl.scanner;

/**
 * TODO
 *
 * @author Kelly
 * @version 1.0.0
 * @filename OnScanListener
 * @time 2020/7/1 11:35
 * @copyright(C) 2020 song
 */
public interface OnScanListener {
    /**
     * 正常扫码成功回调
     *
     * @param barcode
     */
    void onScanSuccess(String barcode);

    /**
     * 扫码失败，回调原始数据
     *
     * @param barcode
     * @param e
     */
    void onScanFail(String barcode, Exception e);


}
