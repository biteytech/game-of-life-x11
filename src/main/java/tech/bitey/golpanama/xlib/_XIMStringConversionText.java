// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct _XIMStringConversionText {
 *     unsigned short length;
 *     XIMStringConversionFeedback *feedback;
 *     int encoding_is_wchar;
 *     union {
 *         char *mbs;
 *         wchar_t *wcs;
 *     } string;
 * }
 * }
 */
public class _XIMStringConversionText {

    _XIMStringConversionText() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Xlib_h.C_SHORT.withName("length"),
        MemoryLayout.paddingLayout(6),
        Xlib_h.C_POINTER.withName("feedback"),
        Xlib_h.C_INT.withName("encoding_is_wchar"),
        MemoryLayout.paddingLayout(4),
        _XIMStringConversionText.string.layout().withName("string")
    ).withName("_XIMStringConversionText");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfShort length$LAYOUT = (OfShort)$LAYOUT.select(groupElement("length"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned short length
     * }
     */
    public static final OfShort length$layout() {
        return length$LAYOUT;
    }

    private static final long length$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned short length
     * }
     */
    public static final long length$offset() {
        return length$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned short length
     * }
     */
    public static short length(MemorySegment struct) {
        return struct.get(length$LAYOUT, length$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned short length
     * }
     */
    public static void length(MemorySegment struct, short fieldValue) {
        struct.set(length$LAYOUT, length$OFFSET, fieldValue);
    }

    private static final AddressLayout feedback$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("feedback"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * XIMStringConversionFeedback *feedback
     * }
     */
    public static final AddressLayout feedback$layout() {
        return feedback$LAYOUT;
    }

    private static final long feedback$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * XIMStringConversionFeedback *feedback
     * }
     */
    public static final long feedback$offset() {
        return feedback$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * XIMStringConversionFeedback *feedback
     * }
     */
    public static MemorySegment feedback(MemorySegment struct) {
        return struct.get(feedback$LAYOUT, feedback$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * XIMStringConversionFeedback *feedback
     * }
     */
    public static void feedback(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(feedback$LAYOUT, feedback$OFFSET, fieldValue);
    }

    private static final OfInt encoding_is_wchar$LAYOUT = (OfInt)$LAYOUT.select(groupElement("encoding_is_wchar"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int encoding_is_wchar
     * }
     */
    public static final OfInt encoding_is_wchar$layout() {
        return encoding_is_wchar$LAYOUT;
    }

    private static final long encoding_is_wchar$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int encoding_is_wchar
     * }
     */
    public static final long encoding_is_wchar$offset() {
        return encoding_is_wchar$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int encoding_is_wchar
     * }
     */
    public static int encoding_is_wchar(MemorySegment struct) {
        return struct.get(encoding_is_wchar$LAYOUT, encoding_is_wchar$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int encoding_is_wchar
     * }
     */
    public static void encoding_is_wchar(MemorySegment struct, int fieldValue) {
        struct.set(encoding_is_wchar$LAYOUT, encoding_is_wchar$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * union {
     *     char *mbs;
     *     wchar_t *wcs;
     * }
     * }
     */
    public static class string {

        string() {
            // Should not be called directly
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout(
            Xlib_h.C_POINTER.withName("mbs"),
            Xlib_h.C_POINTER.withName("wcs")
        ).withName("$anon$1295:5");

        /**
         * The layout of this union
         */
        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        private static final AddressLayout mbs$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("mbs"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * char *mbs
         * }
         */
        public static final AddressLayout mbs$layout() {
            return mbs$LAYOUT;
        }

        private static final long mbs$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * char *mbs
         * }
         */
        public static final long mbs$offset() {
            return mbs$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * char *mbs
         * }
         */
        public static MemorySegment mbs(MemorySegment union) {
            return union.get(mbs$LAYOUT, mbs$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * char *mbs
         * }
         */
        public static void mbs(MemorySegment union, MemorySegment fieldValue) {
            union.set(mbs$LAYOUT, mbs$OFFSET, fieldValue);
        }

        private static final AddressLayout wcs$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("wcs"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * wchar_t *wcs
         * }
         */
        public static final AddressLayout wcs$layout() {
            return wcs$LAYOUT;
        }

        private static final long wcs$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * wchar_t *wcs
         * }
         */
        public static final long wcs$offset() {
            return wcs$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * wchar_t *wcs
         * }
         */
        public static MemorySegment wcs(MemorySegment union) {
            return union.get(wcs$LAYOUT, wcs$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * wchar_t *wcs
         * }
         */
        public static void wcs(MemorySegment union, MemorySegment fieldValue) {
            union.set(wcs$LAYOUT, wcs$OFFSET, fieldValue);
        }

        /**
         * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
         * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
         */
        public static MemorySegment asSlice(MemorySegment array, long index) {
            return array.asSlice(layout().byteSize() * index);
        }

        /**
         * The size (in bytes) of this union
         */
        public static long sizeof() { return layout().byteSize(); }

        /**
         * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
         */
        public static MemorySegment allocate(SegmentAllocator allocator) {
            return allocator.allocate(layout());
        }

        /**
         * Allocate an array of size {@code elementCount} using {@code allocator}.
         * The returned segment has size {@code elementCount * layout().byteSize()}.
         */
        public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
            return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
        }

        /**
         * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
         * The returned segment has size {@code layout().byteSize()}
         */
        public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
            return reinterpret(addr, 1, arena, cleanup);
        }

        /**
         * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
         * The returned segment has size {@code elementCount * layout().byteSize()}
         */
        public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
            return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
        }
    }

    private static final GroupLayout string$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("string"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * union {
     *     char *mbs;
     *     wchar_t *wcs;
     * } string
     * }
     */
    public static final GroupLayout string$layout() {
        return string$LAYOUT;
    }

    private static final long string$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * union {
     *     char *mbs;
     *     wchar_t *wcs;
     * } string
     * }
     */
    public static final long string$offset() {
        return string$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * union {
     *     char *mbs;
     *     wchar_t *wcs;
     * } string
     * }
     */
    public static MemorySegment string(MemorySegment struct) {
        return struct.asSlice(string$OFFSET, string$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * union {
     *     char *mbs;
     *     wchar_t *wcs;
     * } string
     * }
     */
    public static void string(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, string$OFFSET, string$LAYOUT.byteSize());
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

