package org.jcodec.codecs.mpeg12;


public class MPEGTestConst {
    public static final int[] _mpegHeader = { 0x00, 0x00, 0x01, 0xb3, 0x35, 0x51, 0xe0, 0x13, 0xff, 0xff, 0xe1, 0x40,
            0x00, 0x00, 0x01, 0xb5, 0x14, 0x6a, 0x00, 0x01, 0x00, 0x80, 0x00, 0x00, 0x01, 0xb8, 0x00, 0x08, 0x00, 0x00 };
    public static final int[] _mpegFrame = { 0x00, 0x00, 0x01, 0x00, 0x00, 0x0f, 0xff, 0xf8, 0x00, 0x00, 0x01, 0xb5,
            0x8f, 0xff, 0xf3, 0x41, 0x80, 0x00, 0x00, 0x01, 0x01, 0x1b, 0xf8, 0x7d, 0x29, 0x49, 0x4a, 0xe5, 0x29, 0x48,
            0x8b, 0x94, 0xa5, 0x22, 0x2e, 0x52, 0x94, 0x88, 0xb9, 0x4a, 0x52, 0x22, 0xe5, 0x29, 0x48, 0x8b, 0x94, 0xa5,
            0x22, 0x2e, 0x52, 0x94, 0x88, 0xb9, 0x4a, 0x52, 0x22, 0xe5, 0x29, 0x48, 0x8b, 0x94, 0xa5, 0x22, 0x2e, 0x52,
            0x94, 0x88, 0xb9, 0x4a, 0x52, 0x22, 0xe5, 0x29, 0x48, 0x8b, 0x94, 0xa5, 0x22, 0x2e, 0x52, 0x94, 0x88, 0xb9,
            0x4a, 0x52, 0x22, 0xe5, 0x29, 0x48, 0x8b, 0x94, 0xa5, 0x22, 0x2e, 0x52, 0x94, 0x88, 0xb9, 0x4a, 0x52, 0x22,
            0xe5, 0x29, 0x48, 0x8b, 0x94, 0xa5, 0x22, 0x2e, 0x52, 0x94, 0x88, 0xb9, 0x4a, 0x52, 0x22, 0xe5, 0x29, 0x48,
            0x8b, 0x94, 0xa5, 0x22, 0x2e, 0x52, 0x94, 0x88, 0xb9, 0x4a, 0x52, 0x22, 0xe5, 0x29, 0x48, 0x8b, 0x94, 0xa5,
            0x22, 0x2e, 0x52, 0x94, 0x88, 0xb9, 0x4a, 0x52, 0x22, 0xe5, 0x29, 0x48, 0x8b, 0x94, 0xa5, 0x22, 0x2e, 0x52,
            0x94, 0x88, 0xb9, 0x4a, 0x52, 0x22, 0xe5, 0x29, 0x48, 0x8b, 0x94, 0xa5, 0x22, 0x2e, 0x52, 0x94, 0x88, 0xb9,
            0x4a, 0x52, 0x22, 0xe5, 0x29, 0x48, 0x8b, 0x94, 0xa5, 0x22, 0x2e, 0x52, 0x94, 0x88, 0xb9, 0x4a, 0x52, 0x22,
            0xe5, 0x29, 0x48, 0x8b, 0x94, 0xa5, 0x22, 0x2e, 0x52, 0x94, 0x88, 0xb9, 0x4a, 0x52, 0x22, 0xe5, 0x29, 0x48,
            0x8b, 0x94, 0xa5, 0x22, 0x2e, 0x52, 0x94, 0x88, 0xb9, 0x4a, 0x52, 0x22, 0xe5, 0x29, 0x49, 0xce };

    private static final int[] _prores = { 0x00, 0x00, 0xa7, 0xb2, 0x69, 0x63, 0x70, 0x66, 0x00, 0x94, 0x00, 0x00,
            0x74, 0x65, 0x6c, 0x30, 0x02, 0xd0, 0x02, 0x40, 0x84, 0x03, 0x00, 0x00, 0x00, 0x00, 0x00, 0x03, 0x04, 0x04,
            0x04, 0x04, 0x04, 0x04, 0x04, 0x04, 0x04, 0x04, 0x04, 0x04, 0x04, 0x04, 0x04, 0x04, 0x04, 0x04, 0x04, 0x04,
            0x04, 0x04, 0x04, 0x04, 0x04, 0x04, 0x04, 0x04, 0x04, 0x04, 0x04, 0x05, 0x04, 0x04, 0x04, 0x04, 0x04, 0x04,
            0x05, 0x05, 0x04, 0x04, 0x04, 0x04, 0x04, 0x05, 0x05, 0x06, 0x04, 0x04, 0x04, 0x04, 0x05, 0x05, 0x06, 0x07,
            0x04, 0x04, 0x04, 0x04, 0x05, 0x06, 0x07, 0x07, 0x04, 0x04, 0x04, 0x04, 0x04, 0x04, 0x04, 0x04, 0x04, 0x04,
            0x04, 0x04, 0x04, 0x04, 0x04, 0x04, 0x04, 0x04, 0x04, 0x04, 0x04, 0x04, 0x04, 0x04, 0x04, 0x04, 0x04, 0x04,
            0x04, 0x04, 0x04, 0x05, 0x04, 0x04, 0x04, 0x04, 0x04, 0x04, 0x05, 0x05, 0x04, 0x04, 0x04, 0x04, 0x04, 0x05,
            0x05, 0x06, 0x04, 0x04, 0x04, 0x04 };

    public static byte[] toBB(int[][] args) {
        int len = 0;
        for (int i = 0; i < args.length; i++)
            len += args[i].length;

        int off = 0;
        byte[] bytes = new byte[len];
        for (int i = 0; i < args.length; i++) {
            for (int j = 0; j < args[i].length; j++)
                bytes[off++] = (byte) args[i][j];
        }
        return bytes;
    }

    public static byte[] mpeg() {
        return toBB(new int[][]{_mpegHeader, _mpegFrame, _mpegHeader, _mpegFrame, _mpegFrame});
    }

    public static byte[] prores() {
        return toBB(new int[][]{_prores});
    }
}
